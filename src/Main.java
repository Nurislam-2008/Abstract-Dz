//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bread bread = new Bread();
        Pie pie = new Pie();
        Bun bun = new Bun();

        Backed[] bake = new Backed[]{bread, pie, bun};


        for (int i = 0; i < bake.length; i++) {
            System.out.println(bake[i].prepare());


        }
    }
}