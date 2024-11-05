package jwa.estruturas;

public class ListaEncadeada<T> {
    private Node<T> head; // Cabeça da lista

    // Classe interna para representar um nó da lista
    private static class Node<T> {
        T data; // Dados armazenados no nó
        Node<T> next; // Próximo nó na lista

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Método para adicionar um elemento ao final da lista
    public void adicionar(T data) {
        Node<T> novoNo = new Node<>(data);
        if (head == null) {
            head = novoNo; // A lista estava vazia
        } else {
            Node<T> atual = head;
            while (atual.next != null) {
                atual = atual.next; // Move para o próximo nó
            }
            atual.next = novoNo; // Adiciona o novo nó no final
        }
    }

    // Método para remover um elemento da lista
    public boolean remover(T data) {
        if (head == null) {
            return false; // Lista vazia
        }

        if (head.data.equals(data)) {
            head = head.next; // Remove o primeiro nó
            return true;
        }

        Node<T> atual = head;
        while (atual.next != null) {
            if (atual.next.data.equals(data)) {
                atual.next = atual.next.next; // Remove o nó
                return true;
            }
            atual = atual.next; // Move para o próximo nó
        }
        return false; // Elemento não encontrado
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Método para exibir todos os elementos da lista
    public void exibir() {
        Node<T> atual = head;
        while (atual != null) {
            System.out.println("[LIST] > " + atual.data);
            atual = atual.next;
        }
    }
}
