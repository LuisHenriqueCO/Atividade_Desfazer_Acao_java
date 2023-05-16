package atividade_pilha;

import java.util.ArrayList;

public class PilhaAcao {
	
	private ArrayList<Integer> pilha = new ArrayList<Integer>();
	
	public void push(int elemento) {
	    pilha.add(elemento);
	}

	public int pop() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.remove(pilha.size() - 1);
	}

	public int top() {
	    if (pilha.isEmpty()) {
	        throw new RuntimeException("A pilha está vazia");
	    }
	    return pilha.get(pilha.size() - 1);
	}

	public boolean isEmpty() {
	    return pilha.isEmpty();
	}

	public int size() {
	    return pilha.size();
	}
	
	public int get(int index) {
        if (index < 0 || index >= pilha.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        return pilha.get(index);
    }
	
	public void clear() {
		pilha.clear();
	}
}
