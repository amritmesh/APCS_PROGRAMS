package edu.wwp.apcs.pkg11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial 
{
	private LinkedList<Term> terms;
	
	public Polynomial()
	{
		terms = new LinkedList<Term>();
	}

	public String toString() 
	{
		String s = "";
		ListIterator<Term> iterator = terms.listIterator();
		
		while (iterator.hasNext())
		{
			Term currentTerm = iterator.next();
			
			if (currentTerm.getCoefficient() < 0)
			{
				s += currentTerm.toString();
			}
			else
			{
				s += "+" + currentTerm.toString();
			}
		}
		
		return s;
	}

	public void insertTerm(Term t) 
	{
		if (terms.isEmpty())
		{
			terms.add(t);
		}
		else if (t.compareTo(terms.getFirst()) > 0)
		{
			terms.addFirst(t);
		}
		else if (t.compareTo(terms.getLast()) < 0)
		{
			terms.addLast(t);
		}
		else
		{
			ListIterator<Term> iterator = terms.listIterator();
			while (iterator.hasNext())
			{
				Term current = iterator.next();
				
				if (current.compareTo(t) == 0)
				{
					if (t.getCoefficient() == -current.getCoefficient())
					{
						iterator.remove();
						return;
					}
					else
					{
						iterator.set(Term.add(current, t));
						return;
					}
				}
				else if (current.compareTo(t) < 0)
				{
					iterator.previous();
					iterator.add(t);
					return;
				}
			}
		}
	}
	
	public void insertTerm(int c, int d)
	{
		insertTerm(new Term(c, d));
	}
 
	public static Polynomial sum(Polynomial p, Polynomial q)
	{
		Polynomial result = new Polynomial();
		
		ListIterator<Term> iterator = p.terms.listIterator();
		
		while (iterator.hasNext())
		{
			result.insertTerm(iterator.next());
		}
		
		ListIterator<Term> iteratorP = q.terms.listIterator();
		
		while (iteratorP.hasNext())
		{
			result.insertTerm(iteratorP.next());
		}
		
		return result;
	}
 
	public static Polynomial difference(Polynomial p, Polynomial q)
	{
		Polynomial result = new Polynomial();
		
		result.insertTerm(-1, 0);
		Polynomial s = product(q, result);
		
		return sum(p, s);
	}
	
	public static Polynomial product(Polynomial p, Polynomial q)
	{
		Polynomial result = new Polynomial();
		
		ListIterator<Term> iterator = p.terms.listIterator();
		
		while (iterator.hasNext())
		{
			Term staticVar = iterator.next();
			ListIterator<Term> iteratorP = q.terms.listIterator();

			while (iteratorP.hasNext())
			{
				result.insertTerm(Term.multiply(staticVar, iteratorP.next()));
			}
		}
		
		return result;
	}

	public static Polynomial derivative(Polynomial p)
	{
		Polynomial result = new Polynomial();
		
		ListIterator<Term> iterator = p.terms.listIterator();
		
		while (iterator.hasNext())
		{
			Term staticVar = iterator.next();
			Term newTerm = new Term(staticVar.getPower() * staticVar.getCoefficient(), staticVar.getPower() - 1);
			result.insertTerm(newTerm);
		}
		
		return result;
	}
	
    public static void main(String[] args) 
    {
        Polynomial p = new Polynomial();
        p.insertTerm(3, 4);
        p.insertTerm(-2, 0);
        p.insertTerm(-2, 0);
        p.insertTerm(1, 3);
        p.insertTerm(-7, 4);
        p.insertTerm(-1, 3);
        p.insertTerm(7, 2);
        p.insertTerm(-7, 1);
        p.insertTerm(7, 1);

        Polynomial q = new Polynomial();
        q.insertTerm(3, 3);
        q.insertTerm(-2, 1);
        q.insertTerm(-2, 4);
        q.insertTerm(1, 3);
       
        System.out.println("Polynomial p: ");
        System.out.println(p);
        System.out.println("Polynomial q: ");
        System.out.println(q);
        System.out.println("p+q: ");
        System.out.println(Polynomial.sum(p, q));
        System.out.println("p-q: ");
        System.out.println(Polynomial.difference(p, q));
        System.out.println("p*p: ");
        System.out.println(Polynomial.product(p, q));
        System.out.println("derivative of p: ");
        System.out.println(Polynomial.derivative(p));
	}
}
