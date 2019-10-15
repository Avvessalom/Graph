import java.util.*;
public class CreateGraphCommands {
     static void create_line(int k, LinkedList<Node> node){
        Random random = new Random();


//        for(int i = 1; i <= k; i++){
//            node.add(new Node(random.nextInt(3)+1,0.0,0.0,0.0,0.0,
//                    0.0,0.0,0.0,0.0));
//        }

        for (int i = 0; i < node.size()-1; i++){
            Node n = node.get(i);
            Node n1 = node.get(i+1);

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

    static void create_cube(){
         Map<Integer, LinkedList<Node>> mapa= new HashMap<>();
         LinkedList<Node> node1 = new LinkedList<>();
         LinkedList<Node> node2 = new LinkedList<>();
         LinkedList<Node> node3 = new LinkedList<>();
         LinkedList<Node> node4 = new LinkedList<>();
         create_line(50,node1);
         create_line(50,node2);
         create_line(50,node3);
         create_line(50,node4);
         mapa.put(0,node1);
         mapa.put(1,node2);
         mapa.put(2,node3);
         mapa.put(3,node4);
         create_two_lines(node1,node2);
         create_two_lines(node2,node3);
         create_two_lines(node3,node4);
         //show(node1);
         show(node2);
    }

    private static void create_two_lines(LinkedList<Node> node1, LinkedList<Node> node2 ){
        for(Node node: node1){
            for (Node nodes: node2){

                /**
                 * 4
                 */
                if (node.getPriority() == 1 && nodes.getPriority() == 1){
                    node.setUp_link(1.0);
                    nodes.setDown_link(1.0);
                }
                if ((node.getPriority() == 1 && nodes.getPriority() == 2) || (node.getPriority() == 2 && nodes.getPriority() == 1)){
                    node.setUp_link(1.0);
                    nodes.setDown_link(1.0);
                }
                if ((node.getPriority() == 1 && nodes.getPriority() == 3) || (node.getPriority() == 3 && nodes.getPriority() == 1)){
                    node.setUp_link(1.0);
                    nodes.setDown_link(1.0);
                }
                if ((node.getPriority() == 2 && nodes.getPriority() == 3) || (node.getPriority() == 3 && nodes.getPriority() == 2)){
                    node.setUp_link(1.0);
                    nodes.setDown_link(1.0);
                }
                if (node.getPriority() == 2 && nodes.getPriority() == 2){
                    node.setUp_link(1.0);
                    nodes.setDown_link(1.0);
                }
                if (node.getPriority() == 3 && nodes.getPriority() == 3){
                    node.setUp_link(1.0);
                    nodes.setDown_link(1.0);
                }

                for (int i = 1; i < node1.size()-1; i++){
                    Node n = node1.get(i);
                    Node n1 = node2.get(i-1);
                    Node n2 = node2.get(i+1);
                    if (i % 2 == 0){

                        if(n.getPriority() == 1 && n1.getPriority() == 1){
                            n.setDiagonally_up_left_link(1);
                            n1.setDiagonally_down_right_link(1);
                        }

                        if (n.getPriority() == 1 && n2.getPriority() == 1){
                            n.setDiagonally_up_right_link(2);
                            n2.setDiagonally_down_left_link(2);
                        }

                        if(n.getPriority() == 2 && n1.getPriority() == 2){
                            n.setDiagonally_up_left_link(1);
                            n1.setDiagonally_down_right_link(1);
                        }

                        if (n.getPriority() == 2 && n2.getPriority() == 2){
                            n.setDiagonally_up_right_link(2);
                            n2.setDiagonally_down_left_link(2);
                        }

                        if(n.getPriority() == 3 && n1.getPriority() == 3){
                            n.setDiagonally_up_left_link(1);
                            n1.setDiagonally_down_right_link(1);
                        }

                        if (n.getPriority() == 3 && n2.getPriority() == 3){
                            n.setDiagonally_up_right_link(2);
                            n2.setDiagonally_down_left_link(2);
                        }

                        if((n.getPriority() == 1 && n1.getPriority() == 2) || (n.getPriority() == 2 && n1.getPriority() == 1)){
                            n.setDiagonally_up_left_link(1);
                            n1.setDiagonally_down_right_link(1);
                        }

                        if ((n.getPriority() == 1 && n2.getPriority() == 2) || (n.getPriority() == 2 && n2.getPriority() == 1)){
                            n.setDiagonally_up_right_link(2);
                            n2.setDiagonally_down_left_link(2);
                        }

                        if((n.getPriority() == 1 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 1)){
                            n.setDiagonally_up_left_link(1);
                            n1.setDiagonally_down_right_link(1);
                        }

                        if ((n.getPriority() == 1 && n2.getPriority() == 3) || (n.getPriority() == 3 && n2.getPriority() == 1)){
                            n.setDiagonally_up_right_link(2);
                            n2.setDiagonally_down_left_link(2);
                        }

                        if((n.getPriority() == 2 && n1.getPriority() == 3) || (n.getPriority() == 3 && n1.getPriority() == 2)){
                            n.setDiagonally_up_left_link(1);
                            n1.setDiagonally_down_right_link(1);
                        }

                        if ((n.getPriority() == 2 && n2.getPriority() == 3) || (n.getPriority() == 3 && n2.getPriority() == 2)){
                            n.setDiagonally_up_right_link(2);
                            n2.setDiagonally_down_left_link(2);
                        }
                    }
                }
            }
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
