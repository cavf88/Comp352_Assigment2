/**
 * 
 * @author Carlos Andres Vargas Farfan
 * @id 6453740
 *Class that implements a stack data type using an array.
 */
package Question4;

import java.util.EmptyStackException;

public class StackArray<T> 
{
	private T array[];//the generic array holding the elements
	private int cont; //keeps the count of the elements
	private final int size = 10;//the initial size of the array
	private boolean doubleSize;//this is the expansionRule
	
	/**
	 * Creates the object StackArray to hold the objects 
	 */
	public StackArray()
	{
		array = (T[]) new Object[size];
		for(int i = 0; i < size; i++ )
			array[i] =  null;
		cont = -1;
		doubleSize = true;
	}
	/**
	 * Method to put objects in the stack
	 * @param obj a object of any type. This is generic implementation of a stack
	 */
	public void push(T obj)
	{
		if(cont + 1 >= array.length)
			this.expandArray();
		cont++;
		array[cont] = obj;
	}
	/**
	 * Removes the element on top of the stack
	 * @return the element on top of the stack
	 */
	public T pop()
	{
		try
		{
			T auxObj = array[cont];
			array[cont] = null;
			cont--;
			return auxObj;
		}
		catch(ArrayIndexOutOfBoundsException ex )
		{
			EmptyStackException empty = new EmptyStackException();
			throw empty;
		}
	}
	/**
	 * Method that shows the element of top of the stack without removing it
	 * @return the element on top of the array
	 */
	public T peek()
	{ 
		try{return array[cont];}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			EmptyStackException empty = new EmptyStackException();
			throw empty;
		}
	}
	/**
	 * Check if there is the stack is empty or not
	 * @return true if the stack is empty
	 */
	public boolean isEmpty(){return cont == -1 ? true : false;}
	/**
	 * Size of the stack
	 * @return the number of elements in the stack
	 */
	public int size(){return cont + 1;}
	/**
	 * Method to eliminate empty places in the stack
	 */
	public void truncate()

	{
		T auxArray[] = (T[]) new Object[this.size()];
		for(int i = 0; i< this.size(); i++)
			auxArray[i] = array[i];
		array = null;
		array = auxArray;
	}
	/**
	 * Method that changes the expansionRule of the stack
	 * @param c if it is 'c' it changes the rule to constant. If it is 'd' then it changes the rule to double expansion.
	 */
	public void setExpansionRule(char c)
	{
		if(c == 'c')
			doubleSize = false;
		if(c == 'd')
			doubleSize = true;
	}
	
	private void expandArray()
	{
		int expandSize;
		if(doubleSize)
			expandSize = this.size() * 2;
		else
			expandSize = size + array.length;
		
		T auxArray[] = (T[]) new Object[expandSize];
		for(int i = 0 ;i <= cont; i++)
		{
			auxArray[i] = array[i];
		}
		array = null;
		array = auxArray;
	}
}
