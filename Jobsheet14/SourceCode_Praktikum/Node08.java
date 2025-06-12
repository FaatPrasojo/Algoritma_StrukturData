package Jobsheet14.SourceCode_Praktikum;

public class Node08 {
    Mahasiswa08 mahasiswa;
    Node08 left, right;

    public Node08() {
    }

    public Node08(Mahasiswa08 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}