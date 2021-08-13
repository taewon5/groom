
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = "";
        boolean underflow = true;
        boolean e = false;
        int inputcount = 0;
        int listSize = Integer.parseInt(input);
        LinkedList<String> list = new LinkedList<>();
        while (listSize > list.size()) {
            if (list.size() == 0) {
                underflow = true;
            }
            String in = br.readLine();
            if (inputcount % 2 == 0) {
                if (in.equals("d")) {
                    if (underflow) {
                        result += "underflow\n";
                    } else {
                        list.removeFirst();
                    }
                } else {
                    if (in.equals("e")) {
                        e = true;
                        inputcount++;
                    }
                }
            } else {
                if (e) {
                    list.add(in);
                    inputcount++;
                    e = false;
                    underflow = false;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + " ";
        }
        System.out.println(result);
    }
}
