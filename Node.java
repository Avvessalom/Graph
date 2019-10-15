public class Node {

    int priority;
    double previous_link;
    double next_link;
    double up_link;
    double down_link;
    double diagonally_up_right_link;
    double diagonally_down_right_link;
    double diagonally_down_left_link;
    double diagonally_up_left_link;

    Node(int priority, double previous_link, double next_link, double up_link, double down_link,
         double diagonally_up_left_link, double diagonally_up_right_link,
         double diagonally_down_left_link, double diagonally_down_right_link){

        this.priority = priority;
        this.next_link = next_link;  //расстояние до следующего атома
        this.previous_link = previous_link; // расстояние до предидущего атома
        this.up_link = up_link;
        this.down_link = down_link;
        this.diagonally_up_left_link = diagonally_up_left_link;
        this.diagonally_down_left_link = diagonally_down_left_link;
        this.diagonally_up_right_link = diagonally_up_right_link;
        this.diagonally_down_right_link = diagonally_down_right_link;

    }

    int getPriority(){
        return priority;
    }

    void setPriority(int priority){
        this.priority = priority;
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

    void setDiagonally_up_right_link(double diagonally_up_right_link){
        this.diagonally_up_right_link = diagonally_up_right_link;
    }

    double getDiagonally_up_right_link() {
        return diagonally_up_right_link;
    }

    void setDiagonally_up_left_link(double diagonally_up_left_link){
        this.diagonally_up_left_link = diagonally_up_left_link;
    }

    double getDiagonally_up_left_link() {
        return diagonally_up_left_link;
    }

    void setDiagonally_down_right_link(double diagonally_down_right_link){
        this.diagonally_down_right_link = diagonally_down_right_link;
    }

    double getDiagonally_down_right_link(){
        return diagonally_down_right_link;
    }

    void setDiagonally_down_left_link(double diagonally_down_left_link){
        this.diagonally_down_left_link = diagonally_down_left_link;
    }

    double getDiagonally_down_left_link() {
        return diagonally_down_left_link;
    }
}
