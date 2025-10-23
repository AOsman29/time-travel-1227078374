package edu.asu.cse464;

import guru.nidi.graphviz.engine.*;
import guru.nidi.graphviz.model.*;
import static guru.nidi.graphviz.model.Factory.*;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        // Build a simple directed graph
        Graph g = graph("HelloGraph").directed()
            .with(
                node("Hello").link(node("World"))
            );

        // Render to PNG file
        Graphviz.fromGraph(g).render(Format.PNG).toFile(new File("hello-graph.png"));
        System.out.println("✅ Graph generated successfully: hello-graph.png");
    }
}
