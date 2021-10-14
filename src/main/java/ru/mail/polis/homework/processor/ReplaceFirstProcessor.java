package ru.mail.polis.homework.processor;

public class ReplaceFirstProcessor implements TextProcessor {

    private final static ProcessingStage STAGE = ProcessingStage.PROCESSING;
    private final String regex;
    private final String replacement;

    public ReplaceFirstProcessor(String regex, String replacement) {
        this.regex = regex;
        this.replacement = replacement;
    }

    @Override
    public String processText(String text) {
        return text.replaceFirst(regex, replacement);
    }

    @Override
    public ProcessingStage getStage() {
        return STAGE;
    }
}
