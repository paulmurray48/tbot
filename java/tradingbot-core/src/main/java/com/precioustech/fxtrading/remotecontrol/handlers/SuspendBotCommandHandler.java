package com.precioustech.fxtrading.remotecontrol.handlers;

import com.precioustech.fxtrading.remotecontrol.RemoteControl;

public class SuspendBotCommandHandler<M, N, L> implements CommandHandler {
	private final RemoteControl<M, N, L> remote;

	public SuspendBotCommandHandler(RemoteControl<M, N, L> remote) {
		this.remote = remote;
	}

	@Override
	public void handleCommand(String[] args) {
		this.remote.suspendTrading();
	}

}