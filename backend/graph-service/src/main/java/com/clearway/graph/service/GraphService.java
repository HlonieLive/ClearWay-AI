package com.clearway.graph.service;

import com.clearway.graph.model.Node;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphService {

    // For now I'm returning an empty list
    public List<Node> getAllNodes() {
        return List.of();
    }
}