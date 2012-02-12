package $package$

import org.newdawn.slick.AppGameContainer
import org.newdawn.slick.{BasicGame, GameContainer, Graphics, Color}

object $game_class$ {
  def main(args: Array[String]) = {
    val container = new AppGameContainer(new $game_class$, 800, 600, false)

    container.setTargetFrameRate(60)
    container.start
  }
}

class $game_class$ extends BasicGame("$name$") {
  override def render(gc: GameContainer, g: Graphics) {
    g.setColor(Color.white)
    g.drawString("Hello $name$", 200, 10)
  }
}
