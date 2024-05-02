package chat;

import java.util.*;
public class MyChatbot {
	public static void main(String[] args) {
		MyChatbot chatbot = new MyChatbot();
		chatbot.beginChat();
	}


	public static void beginChat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey there! I'm your personal assistant.What's Your name?");
		String Username = sc.nextLine();
		System.out.println("Pleasure to meet you, " + Username +"! How may I be of service today?" );
		
		while(true) {
			String userInput = sc.nextLine();
			String response = SendResponse(userInput);
			System.out.println(response);
			
			if(userInput.equalsIgnoreCase("bye")) {
				break;
			}
		}
		System.out.println("Nice to meet you! " + Username + " Have a nice day!");
		sc.close();
	}
	
	public static String SendResponse(String input) {
		input = input.toLowerCase();
		 switch (input) {
	        case "hello":
	        case "hi":
	            return "Greetings!";
	        case "how are you":
	            return "I'm just here to assist you, but thank you for asking!";
	        case "tell me a fact":
	            return "Octopuses have three hearts and blue blood ";
	        case "tell me a joke":
	        	return "Why couldn't the bicycle stand up by itself? It was two-tired!";
	        case "learn something new":
	            return "Learning is a treasure that will follow its owner everywhere.";
	        case "suggest a book":
	            return "I recommend reading \"The Great Gatsby\" by F. Scott Fitzgerald.";
	        case "find a recipe":
	            return "You can try making paratha. It's simple yet delicious!";
	        case "what's your favorite color":
	            return "I don't have eyes to see color, but I'll go with blue because it sounds calming.";
	        case "what can you do":
	            return "I can provide information, answer questions, and even tell jokes! Just ask away.";
	        case "how can I help you":
	            return "You can help me by asking interesting questions and engaging in conversation!";
	        case "thank you":
	        case "thanks":
	            return "You're most welcome!";
	        default:
	            return provideRandomResponse();
	            
		 }
    }
	
	public static String provideRandomResponse(){
		String[] responses = {
                "My apologies, I'm not quite sure what you mean. Could you elaborate?",
                "Interesting point! Please, do go on.",
                "That's intriguing!",
                "I'm continuously learning. Care to expand on that?",
                "I'm unsure about that.",
        };
        int randomIndex = (int) (Math.random() * responses.length);
        return responses[randomIndex];
    }
}