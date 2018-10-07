package listaduplamenteencadeada;

public class ListaDE<T> {
 
	No<T> primeiro=null;
	No<T> ultimo=null;
	int size=0;
	void addInicio(T e){
		No<T> novo = new No<T>(e);
		if(primeiro==null){
			primeiro=novo;
			ultimo=novo;
		}else{
			primeiro.ant=novo;
			novo.prox=primeiro;
			primeiro=novo;
		}
		size++;
	}

	void addFinal(T e){
		No<T> novo = new No<T>(e);
		if(primeiro==null){
			primeiro=novo;
			ultimo=novo;
		}else{
			novo.ant=ultimo;
			ultimo.prox=novo;
			ultimo=novo;
		}
		size++;
	}
	void add_posicao(T e,int p){
		No<T> novo=new No<T>(e);

	if(primeiro==null){
		primeiro=novo;
		ultimo=novo;
	}else{
		int i=1;
		No<T> aux=primeiro;
		while(i<p && aux!=null){
			
			aux=aux.prox;
			i++;
		}
		novo.prox=aux.prox;
		aux.prox.ant=novo;
		aux.prox=novo;
		
		novo.ant=aux;
		
	}
size++;
	}
		Object removerInicio(){
		No<T> removido=null;	
		if(primeiro==null){
			System.out.print("lista vazia");
		}else{
		removido=primeiro;
		primeiro=primeiro.prox;
		primeiro.ant=null;
		size--;
		}
		return removido;
	}
		Object removerFinal(){
	No<T> removido=null;
			if(primeiro==null){
				System.out.print("lista vazia");
			}else{
				
		removido=ultimo;
		ultimo=ultimo.ant;
		ultimo.prox=null;
		size--;
			}
			
			return removido;
			
			}
			
			
		
	
	void mostrarTrasprafrente(){
		
		while(ultimo!=null){
			System.out.println(ultimo.item_armazenado);
			ultimo=ultimo.ant;
		}
	}
	
void mostrarfrentePRATRAS(){
		
		while(primeiro!=null){
			System.out.println(primeiro.item_armazenado);
			primeiro=primeiro.prox;
		}
	}
	
	public static void main(String args[]){
		ListaDE<String> lista= new ListaDE<String>();
		lista.addInicio("amandinha");
		lista.addInicio("leo");
		lista.addInicio("joao");
		lista.addInicio("zezinho");
		lista.removerInicio();
		lista.removerFinal();
		lista.add_posicao("gina", 1);
		lista.add_posicao("juliana", 1);
	
		lista.mostrarTrasprafrente();
		System.out.println("----------------");
		lista.mostrarfrentePRATRAS();
	}
	
}
