public class Node4 {
    int priority;

    double diagonally_up_right_link;
    double diagonally_down_right_link;
    double diagonally_down_left_link;
    double diagonally_up_left_link;

    Node4(int priority, double diagonally_up_left_link, double diagonally_up_right_link,
          double diagonally_down_left_link, double diagonally_down_right_link){

        this.priority = priority;
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

