# Assignment 7 & 8

**How to use:**

Run the given JAR file from the res folder.
The command to run the jar file will be, from the res folder, "java -jar assignment.jar -script \<input text file\>" to run the program using an input text file, or "java -jar assignment.jar -interactive" to use the GUI.

***Script:***

By default, the JAR file assumes that the input files and images to be loaded are in the res folder when using the script.

Images to modify by blurring, etc. are pre-loaded from the res folder, called landscape.jpg and typical.jpg. Input is from input.txt commands.

In order to perform multiple modification operations on the same image, simply call the modification operations one after another after loading the image you want to modify. In order to modify a generated image, the image must be generated first then loaded in. 

There are three input files in the res folder: input1.txt, input2.txt, and input3.txt. input1.txt has commands for assignment 7, input2.txt has commands for assignment 8, and input3.txt has commands where multiple modifications are run on one image. Input files must be moved into the parent directory of src and res in order for the program to run correctly.

**Input Format:**

* load \<file name in res folder\>. Loads in the image for modification.
* save \<file name in res folder\>. Saves the current image that has been either modified or generated.
* blur
* sharpen
* greyscale
* sepia
* dither
* mosaic \<number of seeds\>
* horizontalrainbow \<width of image\> \<height of individual stripe\>
* verticalrainbow \<width of individual stripe\> \<height of image\>
* checkerboard \<width of individual square\>
* flag \<name of country\> \<width of flag\>
  * france
  * greece
  * switzerland

***GUI:***

The GUI is very intuitive and designed for users with no guidelines. Pressing one of the two buttons of "Modify" or "Generate" on the sidebar on the left
will generate a panel where you can decide which operation you wish to perform. Once you click on the operation you want to perform, the input fields you require
will show. Clicking on "Modify" or "Generate" using the highlighted operation will perform the cited operation. Multiple operations are possible in the case of
modification, meaning that one can blur, sharpen, etc. multiple times on one image.

**Parts of the program that are complete:**

All parts of the program are complete.

* Blur
* Sharpen
* Greyscale
* Sepia
* Dither
* Mosaic
* Horizontal rainbow
* Vertical rainbow
* Checkerboard
* Flag of France (not included in GUI)
* Flag of Greece (not included in GUI)
* Flag of Switzerland (not included in GUI)

**Design Changes:**

No large changes in design were necessary. Only a change in pathing from the script file was necessary from previous code.

**Citations:**

* landscape.jpg from www.pexels.com/photo/rainbow-reflection-on-water-flowing-over-rock-3144151/
* typical.jpg from https://www.pexels.com/photo/person-wearing-scream-mask-and-black-dress-shirt-while-facing-computer-table-during-daytime-218413/
