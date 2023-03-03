package Work02.Unit01;

import java.util.ArrayList;

public class Tree {

    private final ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentsChild(Person parents, Person children) {
        tree.add(new Node(parents, Relationship.parents, children));
        tree.add(new Node(children, Relationship.children, parents));
    }

    // связь муж - жена
    public void appendWifeHusband(Person wife, Person husband) {
        tree.add(new Node(wife, Relationship.wife, husband));
        tree.add(new Node(husband, Relationship.husband, wife));
    }

}