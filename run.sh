#!/bin/bash

# Function to cleanup on exit
cleanup() {
    echo -e "\nStopping..."
    if [[ -n "$PID" ]]; then
        kill $PID 2>/dev/null
        wait $PID 2>/dev/null
    fi
    exit 0
}

# Trap Ctrl+C (SIGINT) and other signals
trap cleanup SIGINT SIGTERM

while true; do
    echo "Starting Gradle..."
    echo "Press 'r' to restart, 'q' to quit"
    ./gradlew run &

    # store Gradle process ID
    PID=$!

    # Read user input in the background
    while true; do
        read -n1 -s key 2>/dev/null || break  # read one character silently, break on Ctrl+C
        if [[ $key = "r" ]]; then
            echo -e "\nRestarting Gradle..."
            # stop the Gradle process
            kill $PID        
            wait $PID 2>/dev/null
            break
        fi
        if [[ $key = "q" ]]; then
            echo -e "\nStopping..."
            kill $PID
            # quit script
            exit 0           
        fi
    done
done