import java.util.*;
public class CreateGraphCommands {
    LinkedList<Node> node1 = new LinkedList<>();
    LinkedList<Node> node2 = new LinkedList<>();
    LinkedList<Node> node3 = new LinkedList<>();
    LinkedList<Node> node4 = new LinkedList<>();
    static Random random = new Random();

    static void create_line(int k, LinkedList<Node8> node){
        for(int i = 1; i <= k; i++){
            node.add(new Node8(random.nextInt(3)+1,0.0,0.0,0.0,0.0,
                    0.0,0.0,0.0,0.0));
        }

        for (int i = 0; i < node.size()-1; i++){
            Node8 n = node.get(i);
            Node8 n1 = node.get(i+1);

            if(n.getNext_link() == 0){
                if (n.getPriority() == 1 && n1.getPriority() == 1){ //-------------------------------------------------------------
                    n.setNext_link(1.0);
                    n1.setPrevious_link(1.0);
                }
                if ((n.getPriority() == 1 && n1.getPriority() == 2) || (n.getPriority() == 2 && n1.getPriority() == 1)){ //-------------------------------------------------------------
                    n.setNext_link(1.0);
                    n1.setPrevious_link(1.0);
                }
                if ((n.getPriority() == 1 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 1)){ //-------------------------------------------------------------
                    n.setNext_link(1.0);
                    n1.setPrevious_link(1.0);
                }
                if ((n.getPriority() == 2 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 2)){ //-------------------------------------------------------------
                    n.setNext_link(1.0);
                    n1.setPrevious_link(1.0);
                }
                if (n.getPriority() == 2 && n1.getPriority() == 2){ //-------------------------------------------------------------
                    n.setNext_link(1.0);
                    n1.setPrevious_link(1.0);
                }
                if (n.getPriority() == 3 && n1.getPriority() == 3){ //-------------------------------------------------------------
                    n.setNext_link(1.0);
                    n1.setPrevious_link(1.0);
                }
            }
        }
    }



//    void create_cube(){
//
//         create_line(50,node1);
//         create_line(50,node2);
//         create_line(50,node3);
//         create_line(50,node4);
//         create_two_lines(node1,node2);
//         create_two_lines(node2,node3);
//         create_two_lines(node3,node4);
//         //show(node1);
//         show(node2);
//    }

//    private static void create_two_lines(LinkedList<Node> node1, LinkedList<Node> node2 ){
//        for(Node node: node1){
//            for (Node nodes: node2){
//
//                /**
//                 * 4
//                 */
//                if (node.getPriority() == 1 && nodes.getPriority() == 1){
//                    node.setUp_link(1.0);
//                    nodes.setDown_link(1.0);
//                }
//                if ((node.getPriority() == 1 && nodes.getPriority() == 2) || (node.getPriority() == 2 && nodes.getPriority() == 1)){
//                    node.setUp_link(1.0);
//                    nodes.setDown_link(1.0);
//                }
//                if ((node.getPriority() == 1 && nodes.getPriority() == 3) || (node.getPriority() == 3 && nodes.getPriority() == 1)){
//                    node.setUp_link(1.0);
//                    nodes.setDown_link(1.0);
//                }
//                if ((node.getPriority() == 2 && nodes.getPriority() == 3) || (node.getPriority() == 3 && nodes.getPriority() == 2)){
//                    node.setUp_link(1.0);
//                    nodes.setDown_link(1.0);
//                }
//                if (node.getPriority() == 2 && nodes.getPriority() == 2){
//                    node.setUp_link(1.0);
//                    nodes.setDown_link(1.0);
//                }
//                if (node.getPriority() == 3 && nodes.getPriority() == 3){
//                    node.setUp_link(1.0);
//                    nodes.setDown_link(1.0);
//                }
//
//                for (int i = 1; i < node1.size()-1; i++){
//                    Node n = node1.get(i);
//                    Node n1 = node2.get(i-1);
//                    Node n2 = node2.get(i+1);
//                    if (i % 2 == 0){
//
//                        if(n.getPriority() == 1 && n1.getPriority() == 1){
//                            n.setDiagonally_up_left_link(1);
//                            n1.setDiagonally_down_right_link(1);
//                        }
//
//                        if (n.getPriority() == 1 && n2.getPriority() == 1){
//                            n.setDiagonally_up_right_link(2);
//                            n2.setDiagonally_down_left_link(2);
//                        }
//
//                        if(n.getPriority() == 2 && n1.getPriority() == 2){
//                            n.setDiagonally_up_left_link(1);
//                            n1.setDiagonally_down_right_link(1);
//                        }
//
//                        if (n.getPriority() == 2 && n2.getPriority() == 2){
//                            n.setDiagonally_up_right_link(2);
//                            n2.setDiagonally_down_left_link(2);
//                        }
//
//                        if(n.getPriority() == 3 && n1.getPriority() == 3){
//                            n.setDiagonally_up_left_link(1);
//                            n1.setDiagonally_down_right_link(1);
//                        }
//
//                        if (n.getPriority() == 3 && n2.getPriority() == 3){
//                            n.setDiagonally_up_right_link(2);
//                            n2.setDiagonally_down_left_link(2);
//                        }
//
//                        if((n.getPriority() == 1 && n1.getPriority() == 2) || (n.getPriority() == 2 && n1.getPriority() == 1)){
//                            n.setDiagonally_up_left_link(1);
//                            n1.setDiagonally_down_right_link(1);
//                        }
//
//                        if ((n.getPriority() == 1 && n2.getPriority() == 2) || (n.getPriority() == 2 && n2.getPriority() == 1)){
//                            n.setDiagonally_up_right_link(2);
//                            n2.setDiagonally_down_left_link(2);
//                        }
//
//                        if((n.getPriority() == 1 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 1)){
//                            n.setDiagonally_up_left_link(1);
//                            n1.setDiagonally_down_right_link(1);
//                        }
//
//                        if ((n.getPriority() == 1 && n2.getPriority() == 3) || (n.getPriority() == 3 && n2.getPriority() == 1)){
//                            n.setDiagonally_up_right_link(2);
//                            n2.setDiagonally_down_left_link(2);
//                        }
//
//                        if((n.getPriority() == 2 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 2)){
//                            n.setDiagonally_up_left_link(1);
//                            n1.setDiagonally_down_right_link(1);
//                        }
//
//                        if ((n.getPriority() == 2 && n2.getPriority() == 3) || (n.getPriority() == 3 && n2.getPriority() == 2)){
//                            n.setDiagonally_up_right_link(2);
//                            n2.setDiagonally_down_left_link(2);
//                        }
//                    }
//                }
//            }
//        }
//    }

    static void create_cube_nodes() {
        LinkedList<Node8> first_line = new LinkedList<>();
        LinkedList<Node4> second_line = new LinkedList<>();
        LinkedList<Node8> third_line = new LinkedList<>();
        LinkedList<Node4> forth_line = new LinkedList<>();
        for (int i = 1; i <= 50; i++) {
            second_line.add(new Node4(random.nextInt(3) + 1, 0.0, 0.0, 0.0, 0.0));
            forth_line.add(new Node4(random.nextInt(3) + 1, 0.0, 0.0, 0.0, 0.0));
        }

        create_line(50, first_line);
        create_line(50, third_line);

        for (int i = 1; i < first_line.size() - 1; i++) {
            Node8 n = first_line.get(i);
            Node8 n1 = third_line.get(i);


                if (n.getPriority() == 1 && n1.getPriority() == 1) { //-------------------------------------------------------------
                    n.setUp_link(1.0);
                    n1.setDown_link(1.0);
                }
                if ((n.getPriority() == 1 && n1.getPriority() == 2) || (n.getPriority() == 2 && n1.getPriority() == 1)) { //-------------------------------------------------------------
                    n.setUp_link(1.0);
                    n1.setDown_link(1.0);
                }
                if ((n.getPriority() == 1 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 1)) { //-------------------------------------------------------------
                    n.setUp_link(1.0);
                    n1.setDown_link(1.0);
                }
                if ((n.getPriority() == 2 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 2)) { //-------------------------------------------------------------
                    n.setUp_link(1.0);
                    n1.setDown_link(1.0);
                }
                if (n.getPriority() == 2 && n1.getPriority() == 2) { //-------------------------------------------------------------
                    n.setUp_link(1.0);
                    n1.setDown_link(1.0);
                }
                if (n.getPriority() == 3 && n1.getPriority() == 3) { //-------------------------------------------------------------
                    n.setUp_link(1.0);
                    n1.setDown_link(1.0);
                }

        }

        for (int i = 1; i < first_line.size()-1; i++) {
            Node4 n = second_line.get(i);
            Node8 n1 = first_line.get(i - 1);
            Node8 n2 = first_line.get(i);

            if ((n.getPriority() == 1 && n1.getPriority() == 1)){
                n.setDiagonally_down_left_link(1);
                n1.setDiagonally_up_right_link(1);
            }
            if ((n.getPriority() == 2 && n1.getPriority() == 2)){
                n.setDiagonally_down_left_link(1);
                n1.setDiagonally_up_right_link(1);
            }
            if ((n.getPriority() == 3 && n1.getPriority() == 3)){
                n.setDiagonally_down_left_link(1);
                n1.setDiagonally_up_right_link(1);
            }
            if ((n.getPriority() == 1 && n1.getPriority() == 2) || (n.getPriority() == 2 && n1.getPriority() == 1)){
                n.setDiagonally_down_left_link(1);
                n1.setDiagonally_up_right_link(1);
            }
            if ((n.getPriority() == 1 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 1)){
                n.setDiagonally_down_left_link(1);
                n1.setDiagonally_up_right_link(1);
            }
            if ((n.getPriority() == 2 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 2)){
                n.setDiagonally_down_left_link(1);
                n1.setDiagonally_up_right_link(1);
            }


            if ((n.getPriority() == 1 && n2.getPriority() == 1)){
                n.setDiagonally_down_right_link(1);
                n2.setDiagonally_up_left_link(1);
            }
            if ((n.getPriority() == 2 && n2.getPriority() == 2)){
                n.setDiagonally_down_right_link(1);
                n2.setDiagonally_up_left_link(1);
            }
            if ((n.getPriority() == 3 && n2.getPriority() == 3)){
                n.setDiagonally_down_right_link(1);
                n2.setDiagonally_up_left_link(1);
            }
            if ((n.getPriority() == 1 && n2.getPriority() == 2) || (n.getPriority() == 2 && n2.getPriority() == 1)){
                n.setDiagonally_down_right_link(1);
                n2.setDiagonally_up_left_link(1);
            }
            if ((n.getPriority() == 1 && n2.getPriority() == 3) || (n.getPriority() == 3 && n2.getPriority() == 1)){
                n.setDiagonally_down_right_link(1);
                n2.setDiagonally_up_left_link(1);
            }
            if ((n.getPriority() == 2 && n2.getPriority() == 3) || (n.getPriority() == 3 && n2.getPriority() == 2)){
                n.setDiagonally_down_right_link(1);
                n2.setDiagonally_up_left_link(1);
            }
        }
        for (Node4 node4: second_line){
            System.out.println("SECOND LINE" + "\n" +
                    "Diagonally_down_left_link: " + node4.getDiagonally_down_left_link() + "\n" +
                    "Diagonally_down_right_link: " + node4.getDiagonally_down_right_link() + "\n");
        }
        for (Node8 node: first_line){
            System.out.println("----------------------------------------" + "\n" +
                    "FIRST LINE" + "\n"+
                    "Priority: " + node.getPriority() + "\n" +
                    "Next_link: " + node.getNext_link() + "\n" +
                    "Previous_link: " + node.getPrevious_link() + "\n" +
                    "Up_link: " + node.getUp_link() + "\n" +
                    "Down_link: " + node.getDown_link() + "\n" +
                    "Diagonally_down_left_link: " + node.getDiagonally_down_left_link() + "\n" +
                    "Diagonally_down_right_link: " + node.getDiagonally_down_right_link() + "\n" +
                    "Diagonally_up_left_link: " + node.getDiagonally_up_left_link() + "\n" +
                    "Diagonally_up_right_link: " + node.getDiagonally_up_right_link());
        }

    }

    static void show(LinkedList<Node> nodes){
        for (Node node: nodes){
            System.out.println("----------------------------------------" + "\n" +
                    "Priority: " + node.getPriority() + "\n" +
                    "Next_link: " + node.getNext_link() + "\n" +
                    "Previous_link: " + node.getPrevious_link() + "\n" +
                    "Up_link: " + node.getUp_link() + "\n" +
                    "Down_link: " + node.getDown_link() + "\n" +
                    "Diagonally_down_left_link: " + node.getDiagonally_down_left_link() + "\n" +
                    "Diagonally_down_right_link: " + node.getDiagonally_down_right_link() + "\n" +
                    "Diagonally_up_left_link: " + node.getDiagonally_up_left_link() + "\n" +
                    "Diagonally_up_right_link: " + node.getDiagonally_up_right_link());
        }
    }
}

