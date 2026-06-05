package com.clearway.graph.controller;

import com.clearway.graph.model.Node;
import com.clearway.graph.service.GraphService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/graphs")
@RequiredArgsConstructor
public class GraphController {

    private final GraphService graphService;

    // Get all nodes (intersections)
    @GetMapping("/nodes")
    public List<Node> getAllNodes() {
        return graphService.getAllNodes();
    }
}