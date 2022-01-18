/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_iterative_factorial.c                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jkutkut <jre-gonz@student.42madrid.com>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/11/30 19:01:01 by jkutkut           #+#    #+#             */
/*   Updated: 2022/01/18 10:02:39 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

int	ft_iterative_factorial(int nb)
{
	int	i;
	int	n;

	if (nb < 0)
		return (0);
	i = 1;
	n = 1;
	while (i++ < nb)
		n *= i;
	return (n);
}
