package net.twistedmc.proxyrestart;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.Title;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import java.util.concurrent.TimeUnit;

public class RestartCommand extends Command {

    public RestartCommand() {
        super("restartproxy");
    }

    @SuppressWarnings("deprecation")
    @Override
    public void execute(CommandSender sender, String[] args) {
        if (!sender.hasPermission("rank.owner")) {
            sender.sendMessage(c.red + "I'm sorry, but you do not have permission to do that.");
            return;
        }

        if (!sender.hasPermission("twisted.perms.owner")) {
            sender.sendMessage(c.red + "[" + c.yellow + c.bold + "!" + c.red + "] " + c.red + c.bold + "Invalid rank!");
            return;
        }

        for (ProxiedPlayer online : BungeeCord.getInstance().getPlayers()) {
            online.sendMessage("");
            online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
            online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
            online.sendMessage("");

            ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                public void run() {
                    online.sendMessage("");
                    online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                    online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                    online.sendMessage("");

                    ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                        public void run() {
                            online.sendMessage("");
                            online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                            online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                            online.sendMessage("");

                            Title title = ProxyServer.getInstance().createTitle();
                            title.title(new TextComponent("§b§kII§r " + c.red + c.bold + "WARNING" + " §b§kII§r"));
                            title.subTitle(new TextComponent(c.red + "Proxy is restarting soon. Please re-connect!"));
                            title.fadeIn(3);
                            title.stay(100);
                            title.fadeOut(4);
                            title.send(online);

                            ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                public void run() {
                                    online.sendMessage("");
                                    online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                    online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                    online.sendMessage("");

                                    ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                        public void run() {
                                            online.sendMessage("");
                                            online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                            online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                            online.sendMessage("");

                                            ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                public void run() {
                                                    online.sendMessage("");
                                                    online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                    online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                    online.sendMessage("");

                                                    ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                        public void run() {
                                                            online.sendMessage("");
                                                            online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                            online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                            online.sendMessage("");

                                                            ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                public void run() {
                                                                    online.sendMessage("");
                                                                    online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                                    online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                                    online.sendMessage("");

                                                                    Title title = ProxyServer.getInstance().createTitle();
                                                                    title.title(new TextComponent("§b§kII§r " + c.red + c.bold + "WARNING" + " §b§kII§r"));
                                                                    title.subTitle(new TextComponent(c.red + "Proxy is restarting soon. Please re-connect!"));
                                                                    title.fadeIn(3);
                                                                    title.stay(100);
                                                                    title.fadeOut(4);
                                                                    title.send(online);

                                                                    ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                        public void run() {
                                                                            online.sendMessage("");
                                                                            online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                                            online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                                            online.sendMessage("");

                                                                            Title title = ProxyServer.getInstance().createTitle();
                                                                            title.title(new TextComponent("§b§kII§r " + c.red + c.bold + "WARNING" + " §b§kII§r"));
                                                                            title.subTitle(new TextComponent(c.red + "Proxy is restarting soon. Please re-connect!"));
                                                                            title.fadeIn(3);
                                                                            title.stay(100);
                                                                            title.fadeOut(4);
                                                                            title.send(online);

                                                                            ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                                public void run() {
                                                                                    online.sendMessage("");
                                                                                    online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                                                    online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                                                    online.sendMessage("");

                                                                                    Title title = ProxyServer.getInstance().createTitle();
                                                                                    title.title(new TextComponent("§b§kII§r " + c.red + c.bold + "WARNING" + " §b§kII§r"));
                                                                                    title.subTitle(new TextComponent(c.red + "Proxy is restarting soon. Please re-connect!"));
                                                                                    title.fadeIn(3);
                                                                                    title.stay(100);
                                                                                    title.fadeOut(4);
                                                                                    title.send(online);

                                                                                    ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                                        public void run() {
                                                                                            online.sendMessage("");
                                                                                            online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                                                            online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                                                            online.sendMessage("");

                                                                                            Title title = ProxyServer.getInstance().createTitle();
                                                                                            title.title(new TextComponent("§b§kII§r " + c.red + c.bold + "WARNING" + " §b§kII§r"));
                                                                                            title.subTitle(new TextComponent(c.red + "Proxy is restarting soon. Please re-connect!"));
                                                                                            title.fadeIn(3);
                                                                                            title.stay(100);
                                                                                            title.fadeOut(4);
                                                                                            title.send(online);

                                                                                            ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                                                public void run() {
                                                                                                    online.sendMessage("");
                                                                                                    online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                                                                    online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                                                                    online.sendMessage("");

                                                                                                    Title title = ProxyServer.getInstance().createTitle();
                                                                                                    title.title(new TextComponent("§b§kII§r " + c.red + c.bold + "WARNING" + " §b§kII§r"));
                                                                                                    title.subTitle(new TextComponent(c.red + "Proxy is restarting soon. Please re-connect!"));
                                                                                                    title.fadeIn(3);
                                                                                                    title.stay(100);
                                                                                                    title.fadeOut(4);
                                                                                                    title.send(online);

                                                                                                    ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                                                        public void run() {
                                                                                                            online.sendMessage("");
                                                                                                            online.sendMessage("§b§kII§r §cThis proxy is restarting soon.");
                                                                                                            online.sendMessage("§b§kII§r §cPlease re-connect to §bplay.twistedmc.net");
                                                                                                            online.sendMessage("");

                                                                                                            Title title = ProxyServer.getInstance().createTitle();
                                                                                                            title.title(new TextComponent("§b§kII§r " + c.red + c.bold + "WARNING" + " §b§kII§r"));
                                                                                                            title.subTitle(new TextComponent(c.red + "Proxy is restarting soon. Please re-connect!"));
                                                                                                            title.fadeIn(3);
                                                                                                            title.stay(100);
                                                                                                            title.fadeOut(4);
                                                                                                            title.send(online);

                                                                                                            ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                                                                public void run() {
                                                                                                                    online.disconnect(c.red + "This proxy is being rebooted. Please join back under " + c.aqua + "play.twistedmc.net" + c.red + "!");
                                                                                                                    online.disconnect(c.red + "This proxy is being rebooted. Please join back under " + c.aqua + "play.twistedmc.net" + c.red + "!");

                                                                                                                    ProxyServer.getInstance().getScheduler().schedule(BungeeCord.getInstance().getPluginManager().getPlugin("ProxyRestart"), new Runnable() {
                                                                                                                        public void run() {
                                                                                                                            BungeeCord.getInstance().stop();

                                                                                                                        }
                                                                                                                    }, 1, TimeUnit.SECONDS);

                                                                                                                }
                                                                                                            }, 10, TimeUnit.SECONDS);

                                                                                                        }
                                                                                                    }, 5, TimeUnit.SECONDS);

                                                                                                }
                                                                                            }, 5, TimeUnit.SECONDS);

                                                                                        }
                                                                                    }, 5, TimeUnit.SECONDS);

                                                                                }
                                                                            }, 10, TimeUnit.SECONDS);

                                                                        }
                                                                    }, 10, TimeUnit.SECONDS);

                                                                }
                                                            }, 10, TimeUnit.SECONDS);

                                                        }
                                                    }, 20, TimeUnit.SECONDS);

                                                }
                                            }, 20, TimeUnit.SECONDS);

                                        }
                                    }, 30, TimeUnit.SECONDS);

                                }
                            }, 30, TimeUnit.SECONDS);

                        }
                    }, 5, TimeUnit.SECONDS);

                }
            }, 5, TimeUnit.SECONDS);


        }
    }
}




