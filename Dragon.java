import java.util.Scanner;
public class Dragon {
        private int x;
        private int y;
        private int width;
        private int height;
    
        public Dragon() {
        }
    
        public Dragon(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    
        public void moveLeft() {
            x--;
        }
    
        public void moveRight() {
            x++;
        }
    
        public void moveUp() {
            y--;
        }
    
        public void moveDown() {
            y++;
        }
    
        public void printPosition() {
            System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
        }
    
        public void detectCollision(int x, int y) {
            if (x >= this.x && x <= this.x + this.width && y >= this.y && y <= this.y + this.height) {
                System.out.println("Kolisi terdeteksi!");
            } else {
                System.out.println("Tidak ada kolisi.");
            }
        }
    
        public static void main(String[] args) {
            Dragon dragon1 = new Dragon(10, 20, 10, 10);
            dragon1.printPosition();
            dragon1.detectCollision(12, 22);
            dragon1.moveRight();
            dragon1.moveDown();
            dragon1.printPosition();
            dragon1.detectCollision(15, 25);
        }
    }
