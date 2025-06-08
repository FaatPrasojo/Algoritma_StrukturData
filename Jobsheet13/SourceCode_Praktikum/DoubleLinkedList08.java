package Jobsheet13.SourceCode_Praktikum;

import java.util.Scanner;

public class DoubleLinkedList08 {
    Node08 head;
    Node08 tail;

    public DoubleLinkedList08() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa08 data) {
        Node08 newNode08 = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode08;
        } else {
            newNode08.next = head;
            head.prev = newNode08;
            head = newNode08;
        }
    }

    public void addLast(Mahasiswa08 data) {
        Node08 newNode08 = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode08;
        } else {
            tail.next = newNode08;
            newNode08.prev = tail;
            tail = newNode08;
        }
    }

    public void insertAftrer(String keyNim, Mahasiswa08 data) {
        Node08 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node08 newNode08 = new Node08(data);

        if (current == tail) {
            current.next = newNode08;
            newNode08.prev = current;
            tail = newNode08;
        } else {
            newNode08.next = current.next;
            newNode08.prev = current;
            current.next.prev = newNode08;
            current.next = newNode08;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    // public void removeFirst() {
    // if (isEmpty()) {
    // System.out.println("Linked list kosong, tidak bisa menghapus.");
    // return;
    // } else if (head == tail) {
    // head = tail = null;
    // } else {
    // head = head.next;
    // head.prev = null;
    // }
    // }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa menghapus.");
            return;
        }

        Mahasiswa08 removedData = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        removedData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa menghapus.");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAfter(String keyNIM) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
        }

        Node08 current = head;

        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNIM + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah data dengan NIM " + keyNIM);
            return;
        }

        Node08 nodeToRemove = current.next;
        current.next = nodeToRemove.next;

        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Node setelah NIM " + keyNIM + " berhasil dihapus.");
    }

    public void remove(String keyNim) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
        }

        Node08 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            System.out.println("Node dengan NIM " + keyNim + " berhasil dihapus (sebagai head).");
            return;
        }
        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
            System.out.println("Node dengan NIM " + keyNim + " berhasil dihapus (sebagai tail).");
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Node dengan NIM " + keyNim + " berhasil dihapus.");
    }

    // public void print() {
    // Node08 current = head;
    // while (current != null) {
    // current.data.tampil();
    // current = current.next;
    // }
    // System.out.println("-----------------------------");
    // }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node08 current = head;
        System.out.println("Isi data Mahasiswa:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        System.out.println("-----------------------------");
    }

    public Node08 search(String nim) {
        Node08 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
