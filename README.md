# Assignment 7 & 8

**How to use:**

Run Driver.java or the given JAR file from the res folder. 
The command to run the jar file will be "java -jar Assignment7.jar \<input text file\>". Input files must be moved into the parent directory of src and res in order for the program to run correctly.

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

**Parts of the program that are complete:**

All parts of the program are complete, including all extra credits.

* Blur
* Sharpen
* Greyscale
* Sepia
* Dither
* Mosaic
* Horizontal rainbow
* Vertical rainbow
* Checkerboard
* Flag of France
* Flag of Greece
* Flag of Switzerland

**Citations:**

* landscape.jpg from www.pexels.com/photo/rainbow-reflection-on-water-flowing-over-rock-3144151/
* typical.jpg from https://www.pexels.com/photo/person-wearing-scream-mask-and-black-dress-shirt-while-facing-computer-table-during-daytime-218413/
