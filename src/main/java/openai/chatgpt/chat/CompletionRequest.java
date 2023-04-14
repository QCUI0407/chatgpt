package openai.chatgpt.chat;

//public record CompletionRequest(String model, String prompt,
//                                double temperature, int max_tokens) {
//
//    public static CompletionRequest defaultWith(String prompt) {
//        return new CompletionRequest("text-davinci-003", prompt, 0.7, 100);
//    }
//
//}

public class CompletionRequest {
    private String model;
    private String prompt;
    private double temperature;
    private int maxTokens;

    CompletionRequest request = new CompletionRequest("text-davinci-003", "Hello world", 0.7, 100);


    public CompletionRequest(String model, String prompt, double temperature, int maxTokens) {
        this.model = model;
        this.prompt = prompt;
        this.temperature = temperature;
        this.maxTokens = maxTokens;
    }

    public static CompletionRequest defaultWith(String prompt) {
        return new CompletionRequest("text-davinci-003", prompt, 0.7, 100);
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }
}
