import java.util.Scanner;

public class CoverCrafter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Gimi Company name");
        String companyName = scanner.nextLine();

        System.out.println("Gimi job position");
        String jobPosition = scanner.nextLine();

        System.out.println("My name is Jose, and I’d like to help " + companyName + " continue its rapid growth as a " + jobPosition + "\n" +
                ". I’m a Computer Science major at Fresno state with over six years of retail sales experience. For a large portion of\n" +
                "that time, I worked as a manager and helped my team launch new products, exceed sales goals, and master my customer service skills.\n" +
                "I believe my skills gained studying as a computer science major alongside my sales experience make me an excellent candidate to slot\n" +
                "into this position.\n" +
                "I have recently worked as a freelance Instacart shopper for over two years. Anyone can shop for Instacart. However, to maintain a high\n" +
                "rating and make a significant profit as an Independent Contractor, they must offer the highest customer service as I do. I have driven\n" +
                "as far south as Lemore and north as Atwater, shopping for groceries all across the valley. \n" +
                "be more knowledgeable about, and solving the many issues that came up in a new field of work with grace.\n" +
                "The main weak point I would say about me as a candidate is that, unfortunately, I would not meet the GPA requirements. Early in my\n" +
                "time here at Fresno State, I was neither prepared nor in a great position to excel in my challenging major. It has only been in the past\n" +
                "two years, after taking a semester off to refocus, that I have been able to effectively manage my time and organize myself such that I\n" +
                "have been able to achieve a 3.0GPA for these past two years." +
                "I understand it may seem like I may be a weaker candidate because of this. However, I believe my past failures have\n" +
                "taught me valuable lessons that may make me an excellent choice. When studying Computer Science, handling data is a foundational skill. Understanding how to analyze it and properly communicate\n" +
                "findings to another party is where the magic happens. Using data at the level" + companyName + " does to increase yields with fewer resources\n" +
                "is genuinely game-changing.\n" +
                "As someone who can’t help themselves from delving deep into a topic to the point of running their experiments when unable to find a\n" +
                "good enough answer, I genuinely admire what " + companyName + " does. Furthermore, as someone who thrives when asked to find solutions for\n" +
                "questions that have yet to be answered entirely, I believe" + companyName + " and I can be a fantastic match.\n" +
                "To wrap it up, thank you for reading my application. I hope I can help " + companyName + " continue to grow and\n" +
                "thrive as well as the clients they service. I would love to continue discussing how my previous experiences and success can help\n" +
                "you achieve your goals.\n");
    }
}
