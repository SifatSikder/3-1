package workship_plainText_to_html;

import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {
    String source;
    int i;
    List<String> result;
    List<String> convertedLine;
    String characterToConvert;

    FileReader fileReader =new FileReader();
    public String toHtml() throws Exception {
        String text = fileReader.read();
        String htmlLines = basicHtmlEncode(text);
        return htmlLines;
    }


    private String basicHtmlEncode(String source) {
        this.source = source;
        i = 0;
        result = new ArrayList<>();
        convertedLine = new ArrayList<>();
        characterToConvert = pickCharacterAndIncrementPointer();

        while (i <= this.source.length()) {
            switch (characterToConvert) {
                case "<":
                    convertedLine.add("&lt;");
                    break;
                case ">":
                    convertedLine.add("&gt;");
                    break;
                case "&":
                    convertedLine.add("&amp;");
                    break;
                case "\n":
                    addANewLineAndResetConvertedLine();
                    break;
                default:
                    convertedLine.add(characterToConvert);
            }

            if (i >= source.length()) break;
            characterToConvert = pickCharacterAndIncrementPointer();
        }
        addANewLineAndResetConvertedLine();
        String finalResult = String.join("<br />", result);
        return finalResult;
    }

    private String pickCharacterAndIncrementPointer() {
        char c = source.charAt(i);
        i += 1;
        return String.valueOf(c);
    }

    private void addANewLineAndResetConvertedLine() {
        String line = String.join("", convertedLine);
        result.add(line);
        convertedLine = new ArrayList<>();
    }
}
