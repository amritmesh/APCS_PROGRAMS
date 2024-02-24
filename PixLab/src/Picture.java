import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
 
  public void chromakey(Picture pic)
  {
	  Pixel a;
	  Pixel b;
	  
	  // x-values for pixels
	  for(int x = 0; x < getWidth(); x++)
	  {
		  // y-values for pixels
		  for (int y = 0; y < getHeight(); y++)
		  {
			  // what pixel are we on right now?
			  a = this.getPixel(x, y);
			  
			  // if the pixel's color is more blue replace with background section of image
			  int c = a.getRed() + a.getGreen();
			  
			  if (c < a.getBlue())
			  {
				  b = pic.getPixel(x, y);
				  a.setColor(b.getColor());
			  }
		  }
	  }
  }
  
  public void encode()
  {
	  Pixel [][] pix = this.getPixels2D();
	  Picture z = new Picture("message.jpg");
	  
	  for (Pixel[] x : pix)
	  {
		  for (Pixel y : x)
		  {
			  if (y.getRed() % 2 != 0)
			  {
				  y.setRed(y.getRed() - 1);
			  }
		  }
	  }
	  
	  Pixel [][] pix2 = z.getPixels2D();
	  
	  for (int x = 0; x < pix2.length; x++)
	  {
		  for (int y = 0; y < pix2.length; y++)
		  {
			  if (pix2[x][y].colorDistance(Color.BLACK) < 10)
			  {
				  pix[x][y].setRed(pix[x][y].getRed() + 1);
			  }
		  }
	  }
	  
	  this.write("secretPicEncoded.jpg");
  }
  
  public void decode()
  {
	  Pixel [][] pix3 = this.getPixels2D();
	
	  for (Pixel[] x : pix3)
	  {
		  for (Pixel y : x)
		  {
			  if (y.getRed() % 2 == 1)
			  {
				  y.setColor(Color.BLACK);
			  }
			  else
			  {
				  y.setColor(Color.WHITE);
			  }
		  }
	  }
	  
	  this.write("secretPicDecoded.jpg");
  }
  
  public void negative()
  {
	  Pixel [] pix4 = this.getPixels();
	  Pixel obj;
	  
	  int red = 0;
	  int green = 0;
	  int blue = 0;
	  
	  for (int x = 0; x < pix4.length; x++)
	  {
		  obj = pix4[x];
		  
		  red = obj.getRed();
		  green = obj.getGreen();
		  blue = obj.getBlue();
		  
		  obj.setColor(new Color(255 - red, 255 - green, 255 - blue));
	  }
  }
  
  public void scale()
  {
	  Picture bigPic = new Picture(FileChooser.getMediaPath("eye.jpg"));
	  
	  Pixel pix1 = null;
	  Pixel pix2 = null;
	  
	  for (int pix1X = 0, pix2X = 0; pix1X < bigPic.getWidth(); pix1X += 2, pix2X++)
	  {
		  
		 for (int pix1Y = 0, pix2Y = 0; pix1Y < bigPic.getHeight(); pix1Y += 2, pix2Y++)
		 {
//			 System.out.println("y" + pix1Y);
			 pix1 = bigPic.getPixel(pix1X, pix1Y);
			 pix2 = this.getPixel(pix2X, pix2Y);
				  
			 pix2.setColor(pix1.getColor());
		 }
	  }
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
//    Picture beach = new Picture("beach.jpg");
//    beach.explore();
//    beach.zeroBlue();
//    beach.explore();
	  
//	  Picture me = new Picture(FileChooser.getMediaPath("meeeeFINAL.jpg"));
//	  Picture background = new Picture(FileChooser.getMediaPath("seagullLarge.jpg"));
//	  
//	  me.chromakey(background);
//	  me.show();
	  
//	  Picture scenery = new Picture("scenery.jpg");
//	  scenery.explore();
//	  scenery.encode();
//	  scenery.explore();
//	  
//	  Picture message = new Picture("messageFINAL.jpg");
//	  message.explore();
	  
//	  Picture encodedPic = new Picture("secretPicEncoded.jpg");
//	  encodedPic.explore();
//	  encodedPic.decode();
//	  encodedPic.explore();
  
//	  String file = "C:/APCS_PROGRAMS/PixLab/images/colors.jpg";
//	  Picture obj = new Picture(file);
//	  
//	  obj.explore();
//	  obj.negative();
//	  obj.explore();
	  
//	  Picture big = new Picture(128, 128);
//	  big.scale();
//	  big.show();
  }
  
} // this } is the end of class Picture, put all new methods before this
