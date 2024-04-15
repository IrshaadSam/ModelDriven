class DisabledPedestrians {
    public void isAssistanceReq(boolean assistanceRequired) {
        this.AssistanceRequired = assistanceRequired;
    }

    public String isButtonPressed() {
        if (AssistanceRequired) {
            return "Assistance button has been pressed. Help is on the way!";
        } else {
            return "Assistance button has not been pressed.";
        }
    }
}
