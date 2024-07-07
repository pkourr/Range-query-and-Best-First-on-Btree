# B-Tree Data Structure Implementation

![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Java](https://img.shields.io/badge/language-Java-brightgreen.svg)
![Version](https://img.shields.io/badge/version-1.0.0-orange.svg)

## Introduction

This project implements a B-Tree data structure with range query and Best First search algorithms. The B-Tree is a balanced tree data structure that maintains sorted data and allows for efficient insertion, deletion, and search operations. The range query algorithm enables searching for all key-value pairs within a specific range of keys, while the Best First algorithm allows for finding a specific key in the tree.

## Features

- **Insertion**: Insert new key-value pairs into the B-Tree.
- **Search**: Find the value associated with a specific key.
- **Deletion**: Remove key-value pairs from the B-Tree.
- **Range Query**: Retrieve all key-value pairs within a specific range of keys.
- **Best First Search**: Efficiently find a specific key in the tree.

## Classes and Methods

### BTree Class

The `BTree` class represents the B-Tree data structure. It contains methods for inserting, searching, and removing elements from the tree. The key algorithms are based on the standard B-Tree data structure theory.

- **insert(Pair key)**: Inserts a new key-value pair into the tree.
- **search(int key)**: Finds the value associated with a specific key.
- **remove(int key)**: Removes a key-value pair from the tree.
- **rangeQuery(int lowerBound, int upperBound)**: Finds all key-value pairs within a specific range of keys.

### Node Class

The `Node` class represents a node in the B-Tree. It manages the keys and children of the node and provides methods for adding and deleting keys, as well as getting information about the node.

### Pair Class

The `Pair` class stores key-value pairs in the tree. It provides methods for getting and setting the key and value.

### Main Class

The `Main` class is used to instantiate and test the `BTree` class. It includes examples of the range query and Best First algorithms.

## Usage

### Instantiate the BTree Class

```java
BTree bTree = new BTree();
```

This creates a new B-Tree with the default order set in the `Main` class's `getT()` method.

### Insert Key-Value Pairs

```java
Pair key = new Pair(5, "value5");
bTree.insert(key);
```

Inserts a new key-value pair with key 5 and value "value5" into the B-Tree.

### Search for a Key

```java
Pair result = bTree.search(5);
```

Searches for the key-value pair with key 5 in the B-Tree. Returns the pair if found, otherwise returns null.

### Remove a Key-Value Pair

```java
bTree.remove(5);
```

Removes the key-value pair with key 5 from the B-Tree.

### Perform Range Query

```java
List<Pair> result = bTree.rangeQuery(2, 8);
```

Returns a list of key-value pairs with keys between 2 and 8 inclusive.

### Change the Order of the B-Tree

```java
bTree.T = 10;
```

Changes the order of the B-Tree to 10, allowing each node to have up to 10 children.

### Perform Best First Search

```java
Pair result = tree.findKey(40);
```

Returns the key if found, otherwise prints "Key not found".

## Developer Guide

In the `Main` class:
- Lines 31-52: Example of the range query algorithm.
- Lines 54-74: Example of the Best First algorithm.

To perform the range query example, uncomment lines 31-52 and comment lines 54-74. To perform the Best First example, run the code as is.

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.
