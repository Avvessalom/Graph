import java.util.*;

public class Main {
    public static void main(String[] args){
        LinkedList<Node> node1 = new LinkedList<>();
        Scanner in = new Scanner(System.in);

//        System.out.println("Enter amount nodes");
//        int num = in.nextInt();
//
//        CreateGraphCommands.create_line(num, node1);
        CreateGraphCommands.create_cube();
        System.out.println("\n" +
                "         /\\____/\\\n"+
                "　　　　　| 　_　 _|\n" +
                "　 　　　／`ミ _x 彡\n" +
                "　　 　 /　　　 　 |\n" +
                "　　　 /　 ヽ　　 ﾉ\n" +
                "　／￣|　　 |　|　|\n" +
                "　| (￣ヽ＿_ヽ_)_)\n" +
                "　＼二つ");
    }
}
