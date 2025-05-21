// User function Template for C++

// Function to find the minimum element in the given BST.

/* struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};
// Utility function to create a new Tree Node
Node* newNode(int val) {
    Node* temp = new Node;
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;

    return temp;
}
*/

class Solution {
  public:
    int minValue(Node* root) {
        if (root == NULL) return -1; // Edge case: empty tree
        
        Node* current = root;
        while (current->left != NULL) {
            current = current->left; // keep going left
        }
        return current->data; // leftmost node's data is the minimum
    }
};
