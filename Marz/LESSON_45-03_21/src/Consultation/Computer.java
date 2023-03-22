package Consultation;

import java.util.Comparator;

public class Computer implements Comparable <Computer>{

    String type;

    int operate_memory;

    int hrd_disk_size;

    String operate_system;

    public Computer(String type, int operate_memory, int hrd_disk_size, String operate_system) {
        this.type = type;
        this.operate_memory = operate_memory;
        this.hrd_disk_size = hrd_disk_size;
        this.operate_system = operate_system;
    }

    @Override
    public String toString() {
        return "\nComputer{" +
                "type='" + type + '\'' +
                ", operate_memory=" + operate_memory +
                ", hrd_disk_size=" + hrd_disk_size +
                ", operate_system='" + operate_system + '\'' +
                '}';
    }




    @Override
    public int compareTo(Computer other) {
        return Integer.compare(this.hrd_disk_size,other.hrd_disk_size);
    }
}
