package Question4;

import java.util.EmptyStackException;

public class StackArray<T> 
{
	private T array[];
	private int cont;
	private final int size = 10;
	private boolean doubleSize;
	
	public StackArray()
	{
		array = (T[]) new Object[size];
		for(int i = 0; i < size; i++ )
			array[i] =  null;
		cont = -1;
		doubleSize = true;
	}
	public void push(T obj)
	{
		if(cont + 1 >= array.length)
			this.expandArray();
		cont++;
		array[cont] = obj;
	}
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
	public T peek()
	{ 
		try{return array[cont];}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			EmptyStackException empty = new EmptyStackException();
			throw empty;
		}
	}
	public boolean isEmpty(){return cont == -1 ? true : false;}
	public int size(){return cont + 1;}
	public void truncate()

	{
		T auxArray[] = (T[]) new Object[this.size()];
		for(int i = 0; i< this.size(); i++)
			auxArray[i] = array[i];
		array = null;
		array = auxArray;
	}
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
			expandSize = size;
		
		T auxArray[] = (T[]) new Object[expandSize];
		for(int i = 0 ;i <= cont; i++)
		{
			auxArray[i] = array[i];
		}
		array = null;
		array = auxArray;
	}
}
