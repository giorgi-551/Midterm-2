# ListSelector – Java List Filtering Example

This is a simple Java program that demonstrates basic list operations. It was created as part of an OOP practice task. The goal is to work with lists, use index-based selection, and perform filtering based on element positions.

## Project Structure

The program is placed inside the `oop.mid2.t1` package. The folder structure should follow the package naming like this:

oop/
└── mid2/
    └── t1/
        └── ListSelector.java

## Description

The program has the following main steps:

1. A `dictionary` list is created containing a set of string values.
2. A second list of integers (`indexList`) is used to select elements from the dictionary.
3. The selected items are added to a `result` list.
4. All elements at even indices in the result list are removed.
5. The final version of the list is printed to the console.

## How to Compile and Run

Make sure the directory structure matches the package name.

### Compile:
javac oop/mid2/t1/ListSelector.java

### Run:
java oop.mid2.t1.ListSelector

## Example Output

Final Filtered List:
W3d7 Vnd8I 6pPTs 6pPTs 2Agf 8

## Concepts Used

- Java Lists and Arrays
- Working with `ArrayList` and `Arrays.asList()`
- Using an index list to select elements from another list
- Removing elements from a list safely using reverse iteration
- Java package organization
