public class Lespiles {
    enum Color {
        blue, green, red, yellow;
    }
    public static void main(String[] args){
       String[] colors=new String[5];
        colors[0]="blue";
        colors[1]="green";
        colors[2]="red";
        colors[3]="yellow";
        colors[1]="emerald";
        for(String color:colors){
            System.out.println(color);
        }

    }
}
