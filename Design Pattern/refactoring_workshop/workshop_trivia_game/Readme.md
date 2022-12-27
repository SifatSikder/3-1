1.Large Class: The class Game is handling 3 responsibilites in 1 class. So I divide the responsibility into 3 Class. Player,Game,Questions

2.Oddball Solution: The function createRockQuestion() is returning a string which I have dealt with deleting the method and replace Inline method

3.DeadCode: The function isPlayable() is not used in the class so it is a deadcode hence i removed it.

4.BlackSheep: The method askQuestions() is redundant in game class so i have removed it in Questions class

5.Duplicate Code: In the  currentQuestionCategory()  there are so many if else code. So I have removed it using enum

6.Long Method: The method roll() is quite big to understand so I have used extract method to make it smaller

7.Primitive obsession: The game class was using Linkedlist data type to do player functionality 
So, I have replace all player related primitive datatype using Player object
