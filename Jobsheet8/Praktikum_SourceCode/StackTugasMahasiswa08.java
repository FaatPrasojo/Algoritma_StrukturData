package Jobsheet8.Praktikum_SourceCode;

public class StackTugasMahasiswa08 {
    Mahasiswa08[] stack;
    int size;
    int top;

    StackTugasMahasiswa08(int size){
        this.size = size;
        top = -1;
        stack = new Mahasiswa08[size];
        }
    
    boolean isFull(){
        if(top==size-1){
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }
    void push(Mahasiswa08 std){
        if(!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    Mahasiswa08 pop(){
        if(!isEmpty()) {
        Mahasiswa08 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Mahasiswa08 peek(){
        if(!isEmpty()){
            return stack[top];
        } else{
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
    
    void print(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i].name + "\t" + stack[i].nim + "\t" + stack[i].className);
        }
        System.out.println("");
    }

    String convertToBinary(int grade) {
        ConversionStack08 stack = new ConversionStack08();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

    public Mahasiswa08 bottom() {
        if (top >= 0) {
            return stack[0];
        } else {
            return null;
        }
    }

    public int count() {
        return top + 1;
    }    

}
