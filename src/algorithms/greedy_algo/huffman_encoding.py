

class Node:
    def __init__(self, char, prob):
        self.character = char
        self.probability = prob
        self.left = None
        self.right = None
        self.huffman = ''


class HuffmanEncoding:
    def sort_list(self, listt):
        # Use appropriate sorting algorithm
        list_new = sorted(listt, key=lambda x: x.probability)
        return list_new

    def generate_huffman_tree(self, node_list):
        # print('rounds')
        # for each_node in node_list:
        #     print(each_node.__dict__)
        if len(node_list) == 1:
            return node_list
        min_a, min_b = node_list[0], node_list[1]
        min_a_index, min_b_index = 0, 1

        combined_node = Node(
            char='NA', prob=node_list[min_a_index].probability + node_list[min_b_index].probability)
        min_a.huffman = 0
        min_b.huffman = 1
        combined_node.left = min_a
        combined_node.right = min_b

        # Remove items manually
        node_list.remove(min_a)
        node_list.remove(min_b)
        placement = 0
        for index, each_node in enumerate(node_list):
            if each_node.probability <= combined_node.probability:
                placement = index
        
        # Insert manually and move the items manually
        node_list.insert(placement+1, combined_node)
        return self.generate_huffman_tree(node_list)

    def prepare_inputs(self, char, prob):
        initial_nodes = []
        for index, _ in enumerate(char):
            a = Node(char=char[index], prob=prob[index])
            initial_nodes.append(a)
        return initial_nodes

    def print_nodes(self, node, val=''):
        new_val = val + str(node.huffman)
        if node.left:
            self.print_nodes(node.left, new_val)
        if node.right:
            self.print_nodes(node.right, new_val)
        if(not node.left and not node.right):
            print(f"{node.character} -> {new_val}")


if __name__ == "__main__":
    char = ['A', 'B', 'C', 'D', '-']
    prob = [0.35, 0.1, 0.2, 0.2, 0.15]
    obj = HuffmanEncoding()
    nodes = obj.prepare_inputs(char, prob)
    nodes = obj.sort_list(nodes)
    result = obj.generate_huffman_tree(nodes)
    obj.print_nodes(result[0])