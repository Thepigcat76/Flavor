import javax.swing.*

fun main() {
    val frame = JFrame("My Swing Window")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    // Create the tabbed pane
    val tabbedPane = JTabbedPane()

    // Create the first tab
    val panel1 = JPanel()
    val label1 = JLabel("This is the first tab.")
    panel1.add(label1)
    tabbedPane.addTab("Tab 1", panel1)

    // Create the second tab
    val panel2 = JPanel()
    val label2 = JLabel("This is the second tab.")
    panel2.add(label2)
    tabbedPane.addTab("Tab 2", panel2)

    // Add a ChangeListener to the tabbed pane
    tabbedPane.addChangeListener { event ->
        val source = event.source
        if (source is JTabbedPane) {
            val selectedIndex = source.selectedIndex
            if (selectedIndex == 1) {
                // Do something when the second tab is selected
                JOptionPane.showMessageDialog(frame, "Selected Tab 2!")
            }
        }
    }

    // Add the tabbed pane to the JFrame
    frame.add(tabbedPane)

    frame.setSize(400, 300)
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}