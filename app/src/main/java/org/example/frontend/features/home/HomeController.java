package org.example.frontend.features.home;

import javafx.fxml.FXML;
import org.example.frontend.shared.components.layout.NavigationService;

public class HomeController {
    @FXML
    public void showDashboard() {
        NavigationService.showDashboard();
    }
}
