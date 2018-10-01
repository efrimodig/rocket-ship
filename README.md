# Scalable Rocket Ship ASCII Art Project
Two parts, 45 total points.

## Part 1
Create a program that prints various size ASCII art rocket by calling the `drawRocket()` method specifying the rocket size
as an integer parameter. Your `main()` method should call the `drawRocket()` method, passing the rocket size parameter. 
The rocket size parameter is the only value that should change in order to print different size rocket! The `drawRocket()` 
method must be able to handle illegal sizes (e.g. 0, negative sizes).  If it receives an illegal size, it should print 
nothing.

**Size 1 rocket**
```
 /**\
+=*=*+
|/\/\|
|\/\/|
+=*=*+
|\/\/|
|/\/\|
+=*=*+
 /**\
```
**Size 2 rocket**
```
   /**\
  //**\\
+=*=*=*=*+
|./\../\.|
|/\/\/\/\|
|\/\/\/\/|
|.\/..\/.|
+=*=*=*=*+
|\/\/\/\/|
|.\/..\/.|
|./\../\.|
|/\/\/\/\|
+=*=*=*=*+
   /**\
  //**\\
```
**Size 5 rocket**
```
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
```
**Part 1 Grading Scheme/Rubric**

**Functional Correctness - 10 points**
---------------------------------------
1 point: Correctly define a rocket size parameter    
1 point: Correctly define the `main()` method.  
1 point: Correctly call the `drawRocket()` method in main.    
1 point: Correctly define the `drawRocket()` method with correct parameter.    
2 points: Procedural Decomposition  
  - 0 point: All work done in `drawRocket()`  
  - 1 point: Partial procedural decomposition    
  - 2 points: Full procedure decomposition    

4 points: Correctness of output  
  - Correct output for illegal sizes    
  - Correct output for size 1  
  - Correct output for odd sizes    
  - Correct output for even sizes  
    

**Coding Style - 10 points**  
-----------------------------  
- Good: 2 points
- Fair: 1 point
- Poor: 0 point  

2 points: Readability: Indentation  
2 points: Readability: Meaningful method and variable names.  
2 points: Readability: Comments/Documentation.  
2 points: Efficiency: Code duplication.  
2 points: Efficiency: Smart algorithm.  

##Part 2##
Modify your main method to call the `rocketLaunch()` method. The `rocketLaunch()` method takes three integer parameters: 
minSize, maxSize and sizeStep that are defined as class constants. It will call the `drawRocket()` method to print 
several rockets from maxSize to minSize decreasing the rocket size by sizeStep on each rocket. The resulting output will 
look like the big rocket is chasing and eating the smaller rocket.

The following example demonstrates a call to `rocketLaunch(2, 5, 1)` with 2 as minSize, 5 as maxSize and 1 as sizeStep. 
This will print the rockets sized 2, 3, 4, and 5.

Example output of `rocketLaunch(2, 5, 1)`
```
     /**\
    +=*=*+
    |/\/\|
    |\/\/|
    +=*=*+
    |\/\/|
    |/\/\|
    +=*=*+
     /**\

     /**\
    //**\\
  +=*=*=*=*+
  |./\../\.|
  |/\/\/\/\|
  |\/\/\/\/|
  |.\/..\/.|
  +=*=*=*=*+
  |\/\/\/\/|
  |.\/..\/.|
  |./\../\.|
  |/\/\/\/\|
  +=*=*=*=*+
     /**\
    //**\\

     /**\
    //**\\
   ///**\\\
  +=*=*=*=*+
  |./\../\.|
  |/\/\/\/\|
  |\/\/\/\/|
  |.\/..\/.|
  +=*=*=*=*+
  |\/\/\/\/|
  |.\/..\/.|
  |./\../\.|
  |/\/\/\/\|
  +=*=*=*=*+
     /**\
    //**\\
   ///**\\\

     /**\
    //**\\
   ///**\\\
  ////**\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
```

The `rocketLaunch()` method may assume the parameters are valid. In other words, it doesn’t need to check for parameter 
error. It is important to note that all the rockets printed *must be center justified*. In order to do this, the 
`drawRocket()` method must accept a second integer parameter leftPadding that specifies the number of spaces inserted to 
the left of the rocket so that it will be aligned with bigger rockets at the center column.

##Grading Scheme/Rubric##

**Functional Correctness - 15 points**
---------------------------------------

2 points: Correctly define the minSize, maxSize, sizeStep class constants.  
- 2 points: Fully correct  
- 1 points: Partially correct  
- 1 point: Missing or incorrect  

1 point: Correctly call the `rocketLaunch()` method in main.  
1 point: Correctly define the `rocketLaunch()` method with correct parameters.  
1 point: Correct implementation of the for-loop in the `rocketLaunch()` method.  
2 points: Proper use of procedural decomposition.  
- 0 points: All work done in `rocketLaunch()`  
- 1 point: Partial procedural decomposition  
- 2 points: Full procedure decomposition  

8 points: Correctness of output.  
- Correct alignment for odd size, odd center column  
- Correct alignment for odd size, even center column  
- Correct alignment for even size, odd center column  
- Correct alignment for even size, even center column  
- rocketLaunch(1, 3, 1)  
- rocketLaunch(1, 9, 2)  
- rocketLaunch(2, 10, 2)  
- minSize 1, random maxSize up to 20, random step between 1 and 4  

**Coding Style - 10 points**  
-----------------------------  
- Good: 2 points
- Fair: 1 point
- Poor: 0 point  

2 points: Readability: Indentation  
2 points: Readability: Meaningful method and variable names.  
2 points: Readability: Comments/Documentation.  
2 points: Efficiency: Code duplication.  
2 points: Efficiency: Smart algorithm. 
