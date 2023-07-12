/*
package programmiercamp.gui;


import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class MethGUI extends Screen {

    private final int guiWidth = 176;
    private final int guiHeight = 166;

    protected MethGUI() {
        super(new LiteralText("My Custom GUI").formatted(Formatting.WHITE));
    }

    @Override
    protected void init() {
        addButton(new ButtonWidget(width / 2 - 50, height / 2 - 10, 100, 20, new LiteralText("Button"), button -> {
            // Button click event handler
            System.out.println("Button clicked");
        }));
    }

    @Override
    public void render(int mouseX, int mouseY, float delta) {
        renderDirtBackground(0);
        drawCenteredText(this.textRenderer, this.title, width / 2, 20, 0xFFFFFF);
        super.render(mouseX, mouseY, delta);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        boolean superResult = super.mouseClicked(mouseX, mouseY, button);
        // Handle custom logic
        return superResult;
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        boolean superResult = super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
        // Handle custom logic
        return superResult;
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        boolean superResult = super.keyPressed(keyCode, scanCode, modifiers);
        // Handle custom logic
        return superResult;
    }
}

 */