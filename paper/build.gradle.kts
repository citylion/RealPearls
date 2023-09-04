plugins {
	id("io.papermc.paperweight.userdev")
}

dependencies {
    paperDevBundle("1.18.2-R0.1-SNAPSHOT")

    compileOnly("net.civmc.civmodcore:civmodcore-paper:2.3.5:dev-all")
    compileOnly("net.civmc.namelayer:namelayer-paper:3.0.4:dev")
    compileOnly("net.civmc.citadel:citadel-paper:5.1.2:dev")
    compileOnly("net.civmc.civchat2:civchat2-paper:2.0.3:dev")
    compileOnly("net.civmc.bastion:bastion-paper:3.0.1:dev")
    compileOnly("net.civmc.combattagplus:paper:2.0.0-SNAPSHOT:dev")
	compileOnly("net.civmc.banstick:banstick-paper:2.0.1:dev")
	compileOnly("net.civmc.randomspawn:randomspawn-paper:3.0.2:dev")

	implementation(files("/home/citylion/IdeaLibs/scarcity-1.0-SNAPSHOT.jar"))

	compileOnly("com.github.DieReicheErethons:Brewery:3.1")
}
