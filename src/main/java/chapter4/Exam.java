package chapter4;

public class Exam {
    public static void main(String[] args) {

        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"https://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)";

        System.out.println(log.indexOf(" "));
        System.out.println(log. indexOf("-"));

        System.out.println(log.substring(0, log.indexOf(" ")));
        System.out.println(log.indexOf("-"));

        int a = log.indexOf("\"");
        int b = log.indexOf(" /",a);

        System.out.println(log.substring(a+1 , b));
    }
}
