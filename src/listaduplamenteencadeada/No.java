package listaduplamenteencadeada;

public class No<T> {

	T item_armazenado;
	No<T> prox;
	No<T> ant;
	
	public No(T e){
		this.item_armazenado=e;
		this.prox=null;
		this.ant=null;
	}
	public No(){
		
	}
}
