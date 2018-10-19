package poo;

public class Pedido {
private String situacao;
private int data;
Cliente cliente;
ItemPedido pedido;

public Pedido(String situacao, int data, Cliente cliente) {
	super();
	this.situacao = situacao;
	this.data = data;
	this.cliente = cliente;
}
public Pedido(){
	
}
void RealizarPedido(){
	if(this.cliente instanceof Cliente){
		cliente.getNome();
	}else{
		System.out.println("Esse cliente não esta cadastrado");
	}
	
}


}
