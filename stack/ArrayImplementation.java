public class ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.print("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        // in java if array is empty means every element fill with 0
        int pop() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0) {
                return true;
            }

            return false;
        }

        boolean isFull() {
            if (arr.length == idx) {
                return true;
            }
            return false;
            
        }
    }

    public static void main(String[] args) {
        // we have created a class object now our motive is to create our
        // own function to build stack
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();// 4 5 6
        System.out.println(st.size());// 3
        st.pop();
        st.display(); // 4 5

    }
}
