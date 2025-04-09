package org.company

class PipelineUtils {
    // Method to send notifications on success
    static void notifySuccess(String message) {
        echo "SUCCESS: ${message}"
        // Example: Send a Slack notification or email on success
    }

    // Method to send notifications on failure
    static void notifyFailure(String message) {
        echo "FAILURE: ${message}"
        // Example: Send a Slack notification or email on failure
    }

    // Method to clean workspace before starting a build
    static void cleanWorkspace() {
        echo "Cleaning workspace..."
        deleteDir()  // Deletes the workspace folder
    }
}
