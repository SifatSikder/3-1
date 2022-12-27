1.Comment Smell: There was comment in some part of code so I removed those comments

2.Inappropriate Naming: The function named stashNextCharacterAndAdvanceThePointer() is choosing a character and incrementing the pointer so I changed the function name to pickCharacterAndIncrementPointer()

3.Black Sheep: The function 'read' is not similar with the PlaintextToHtmlConverter. So I created an interface called Reader.java
and also created another class FileReader.java which implemented 

4.OddBall Solution: The pushACharacterToTheOutput() is adding a character to the convertedLine List<String> which is convertedLine.add() so I replace the pushACharacterToTheOutput() with inLine method

