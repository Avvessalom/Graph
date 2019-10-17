public class Node8 extends Node4 {

    double previous_link;
    double next_link;
    double up_link;
    double down_link;

    Node8(int priority, double previous_link, double next_link, double up_link, double down_link, double diagonally_up_left_link, double diagonally_up_right_link, double diagonally_down_left_link, double diagonally_down_right_link) {
        super(priority, diagonally_up_left_link, diagonally_up_right_link, diagonally_down_left_link, diagonally_down_right_link);
        this.priority = priority;
        this.next_link = next_link;  //расстояние до следующего атома
        this.previous_link = previous_link; // расстояние до предидущего атома
        this.up_link = up_link;
        this.down_link = down_link;
    }
    void setPrevious_link(double previous_link){
        this.previous_link = previous_link;
    }

    double getPrevious_link() {
        return previous_link;
    }

    void setNext_link(double next_link){
        this.next_link = next_link;
    }

    double getNext_link() {
        return next_link;
    }

    void setUp_link(double up_link){
        this.up_link = up_link;
    }

    double getUp_link(){
        return up_link;
    }

    void setDown_link(double down_link){
        this.down_link = down_link;
    }

    double getDown_link(){
        return down_link;
    }
}