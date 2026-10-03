
public class Main {
    public static void main(String[] args) {

        Question[] myquestion = {
        new MultiplechoiseQ("کدام کلمه کلیدی برای دسترسی به متد یا فیلد کلاس والد استفاده می‌شود؟",
                new String[]{"this", "super", "extends", "abstract"},
                "2"),
        new MultiplechoiseQ("کدام ویژگی جاوا اجازه می‌دهد یک متد در کلاس فرزند، عملکرد متد کلاس والد را تغییر دهد؟",
                new String[]{"Overloading", "Encapsulation", "Inheritance", "Overriding"},
                "4"),
        new TrueFalseQ("آیا در جاوا می‌توان یک کلاس را از دو کلاس غیر اینترفیس ارث‌بری کرد؟","2")
        };

        Exam javaExam = new Exam("JAVA EXAM" , myquestion);
        javaExam.startExam();
    }
    }
